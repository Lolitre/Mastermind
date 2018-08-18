/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DemoLog4j {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DemoLog4j test = new DemoLog4j();
        test.TestLog();
    }
    private Log log = LogFactory.getLog(DemoLog4j.class);

    public void TestLog() {
        log.debug("msg de de bug");
        log.fatal("msg d'erreur fatal");
        log.warn("msg d'avertissement");
        log.error("msg d'erreur");
        log.info("msg d'information");
    }
}
