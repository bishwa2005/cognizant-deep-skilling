package module_4_test_driven_development_and_logging_framework.mockito;

@Test
void testOrder() {
    ExternalApi api = mock(ExternalApi.class);

    api.login();
    api.logout();

    InOrder order = inOrder(api);

    order.verify(api).login();
    order.verify(api).logout();
}
