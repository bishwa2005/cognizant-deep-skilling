package module_4_test_driven_development_and_logging_framework.mockito;

@Test
void testFetchData() {
    ExternalApi api = mock(ExternalApi.class);

    when(api.getData()).thenReturn("Hello");

    MyService service = new MyService(api);

    assertEquals("Hello", service.fetchData());
}
