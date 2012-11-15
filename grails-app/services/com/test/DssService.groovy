package com.test

import oasis.names.tc.dss._1_0.core.schema.SignatureObjectType
import oasis.names.tc.dss._1_0.core.schema.VerifyRequest
import org.w3._2000._09.xmldsig.X509DataType
import javax.xml.soap.SOAPException
import oasis.names.tc.dss._1_0.core.schema.VerifyResponse

class DssService {

    oasis.names.tc.dss._1_0.core.wsdl.SOAPport dssServiceClient

    VerifyResponse verify() {
        def request = new VerifyRequest()

        try {
            dssServiceClient.verify(request)
        } catch(SOAPException soapException){
            log.error soapException.message
            throw soapException
        } catch(Exception e){
            log.error e.message
            throw e
        }
    }
}
