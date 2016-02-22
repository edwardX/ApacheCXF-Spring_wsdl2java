package mx.edx.com.cxf.spring;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author edx
 */
@WebService
public interface ServiceCXF {
   
    /**
     * We are using sayHiInput as is declared in WSDL
     * @param sayHi
     * @return sampleResponse
     */
    String hiFromCXF(@WebParam(name="sayHiInput")  String sayHi);

}
