package module_4_test_driven_development_and_logging_framework.mockito;

@Test
void testVoidMethod() {
    ExternalApi api = mock(ExternalApi.class);

    doNothing().when(api).clearData();

    api.clearData();

    verify(api).clearData();
}