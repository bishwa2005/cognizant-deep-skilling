package module_4_test_driven_development_and_logging_framework.mockito;

@Test
void testException() {
    ExternalApi api = mock(ExternalApi.class);

    doThrow(new RuntimeException())
            .when(api).deleteData();

    assertThrows(RuntimeException.class,
            () -> api.deleteData());
}
