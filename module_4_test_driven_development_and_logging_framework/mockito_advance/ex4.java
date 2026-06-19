package module_4_test_driven_development_and_logging_framework.mockito_advance;

@Test
void testNetworkService() {
    NetworkClient client =
            mock(NetworkClient.class);

    when(client.connect())
            .thenReturn("Server");

    NetworkService service =
            new NetworkService(client);

    assertEquals("Connected to Server",
                 service.connectToServer());
}
