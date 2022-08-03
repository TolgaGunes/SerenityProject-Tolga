package b22.spartan.editor;

import net.serenitybdd.junit5.SerenityTest;
import org.asciidoctor.extension.MacroProcessor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.SpartanNewBase;
import utilities.SpartanUtil;

import java.util.Map;

@SerenityTest
public class SpartanEditorPostTest extends SpartanNewBase {

   @DisplayName("Editor should be able to POST")
    @Test
    public void test1() {

       //create spartan using util
       Map<String,Object> bodyMap = SpartanUtil.getRandomSpartanMap();
       System.out.println("bodyMap = " + bodyMap);

   }


}
