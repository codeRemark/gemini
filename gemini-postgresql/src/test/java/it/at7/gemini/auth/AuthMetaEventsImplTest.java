package it.at7.gemini.auth;

import it.at7.gemini.boot.IntegrationTestMain;
import it.at7.gemini.exceptions.GeminiException;
import org.springframework.context.ConfigurableApplicationContext;

public class AuthMetaEventsImplTest extends AuthMetaEventsAbstTest {
    @Override
    protected ConfigurableApplicationContext getApplicationContext() throws GeminiException {
        return IntegrationTestMain.initializeGemini(AuthModule.class);
    }
}