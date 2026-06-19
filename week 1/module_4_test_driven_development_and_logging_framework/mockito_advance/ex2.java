package module_4_test_driven_development_and_logging_framework.mockito_advance;

@Test
void testApiService() {
    RestClient client = mock(RestClient.class);

    when(client.getResponse())
            .thenReturn("Success");

    ApiService service = new ApiService(client);

    assertEquals("Fetched Success",
                 service.fetchData());
}
