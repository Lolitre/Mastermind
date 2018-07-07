/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 *
 * @author lolit
 */
public class ReadLog4j {

    private Log log = LogFactory.getLog(ReadLog4j.class);

    public void TestLog() {
        log.debug("msg de debug");
        log.fatal("msg d'erreur fatal");
        log.warn("msg d'avertissement");
        log.error("msg d'erreur");
        log.info("msg d'information");
        
    }
}
