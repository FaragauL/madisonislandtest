package org.fasttrackit.tests.search;

import org.fasttrackit.steps.HeaderSteps;
import org.fasttrackit.steps.ProductGridSteps;
import org.fasttrackit.tests.TestBase;
import org.junit.Test;

public class SearchTest extends TestBase {

    @Test
    public void searchWithOneKeywordTest() {

        HeaderSteps headerSteps = new HeaderSteps();
        headerSteps.search("vase");

        ProductGridSteps productGridSteps = new ProductGridSteps(); //obiect de tip ProductGridSteps
        productGridSteps.assertThatAllProductNamesContain("vase".toUpperCase()); //apelare metoda assert...
    }
}
