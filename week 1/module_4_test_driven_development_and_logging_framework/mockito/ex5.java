package module_4_test_driven_development_and_logging_framework.mockito;

@Test
void testMultipleReturns() {
    ExternalApi api = mock(ExternalApi.class);

    when(api.getData())
            .thenReturn("First")
            .thenReturn("Second");

    assertEquals("First", api.getData());
    assertEquals("Second", api.getData());
}