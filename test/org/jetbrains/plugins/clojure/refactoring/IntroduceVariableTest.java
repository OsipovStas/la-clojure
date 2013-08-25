package org.jetbrains.plugins.clojure.refactoring;

import com.intellij.lang.LanguageRefactoringSupport;
import com.intellij.refactoring.RefactoringActionHandler;
import org.jetbrains.plugins.clojure.ClojureLanguage;

/**
 * @author Stanislav.Osipov
 * @since 8/23/13
 */
public class IntroduceVariableTest extends ClojureRefactoringTestBase {

  @Override
  protected RefactoringActionHandler getRefactoringActionHandler() {
    return LanguageRefactoringSupport.INSTANCE.findSingle(ClojureLanguage.getInstance()).getIntroduceVariableHandler();
  }

  public void testSimpleSelection() throws Exception {
    doTest();
  }

}