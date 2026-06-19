package module_4_test_driven_development_and_logging_framework.mockito;
@Test
void testArgumentMatcher() {
    ExternalApi api = mock(ExternalApi.class);

    api.sendData("Mockito");

    verify(api).sendData(anyString());
}
