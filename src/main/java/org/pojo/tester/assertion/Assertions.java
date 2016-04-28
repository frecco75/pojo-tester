package org.pojo.tester.assertion;


public class Assertions {

    private final ResultBuilder resultBuilder = new ResultBuilder();

    public EqualAssertions assertThat(final Object objectUnderAssert) {
        return new EqualAssertions(resultBuilder, objectUnderAssert);
    }

    public void assertAll() {
        final Result result = resultBuilder.build();
        if (result.failed()) {
            throw new AssertionError(result.getMessage());
        }
    }
}