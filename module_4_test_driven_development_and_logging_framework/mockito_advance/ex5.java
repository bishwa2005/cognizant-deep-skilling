package module_4_test_driven_development_and_logging_framework.mockito_advance;

@Test
void testMultipleReturns() {
    Repository repo = mock(Repository.class);

    when(repo.getData())
            .thenReturn("Data1")
            .thenReturn("Data2");

    assertEquals("Data1", repo.getData());
    assertEquals("Data2", repo.getData());
}
