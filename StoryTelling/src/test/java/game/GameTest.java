package game;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GameTest {

    @Mock
    private Appender appender;

    @Captor
    private ArgumentCaptor<ILoggingEvent> captor;

    @BeforeEach
    public void setup() {
        Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logger.addAppender(appender);
    }

    @Test
    public void testValidate() {

        Game game = new Game();

        game.test();

        verify(appender).doAppend(captor.capture());

        captor.getAllValues().forEach(event -> {
            if (event.getLevel().equals(Level.INFO)) {
                assertEquals("test message - successful", event.getFormattedMessage());
            }
        });
    }
}