package mx.edx.com.cxf.spring.impl;

import javax.jws.WebService;
import mx.edx.com.cxf.spring.ServiceCXF;

/**
 *
 * @author edx
 */
@WebService(endpointInterface="mx.edx.com.cxf.spring.ServiceCXF")

public class ServiceCXFImpl implements ServiceCXF {

    @Override
    public String hiFromCXF(String sayHi) {
       return "Hi from Apache CXF ...."+sayHi;
    }
    
}
