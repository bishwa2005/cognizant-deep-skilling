package module_4_test_driven_development_and_logging_framework.mockito;

@Test
void testVerify() {
    ExternalApi api = mock(ExternalApi.class);

    MyService service = new MyService(api);
    service.fetchData();

    verify(api).getData();
}