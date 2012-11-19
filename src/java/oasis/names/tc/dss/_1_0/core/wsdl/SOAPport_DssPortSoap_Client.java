
package oasis.names.tc.dss._1_0.core.wsdl;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-11-19T09:57:48.373-06:00
 * Generated source version: 2.6.2
 * 
 */
public final class SOAPport_DssPortSoap_Client {

    private static final QName SERVICE_NAME = new QName("urn:oasis:names:tc:dss:1.0:core:wsdl", "digitalSignatureService");

    private SOAPport_DssPortSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DigitalSignatureService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DigitalSignatureService ss = new DigitalSignatureService(wsdlURL, SERVICE_NAME);
        SOAPport port = ss.getDssPortSoap();  
        
        {
        System.out.println("Invoking archiveDelete...");
        oasis.names.tc.dss._1_0.profiles.archive.ArchiveIdentifierRequest _archiveDelete_archiveDeleteRequest = null;
        oasis.names.tc.dss._1_0.profiles.archive.ArchiveDeleteResponse _archiveDelete__return = port.archiveDelete(_archiveDelete_archiveDeleteRequest);
        System.out.println("archiveDelete.result=" + _archiveDelete__return);


        }
        {
        System.out.println("Invoking archiveModify...");
        oasis.names.tc.dss._1_0.profiles.archive.ArchiveIdentifierRequest _archiveModify_archiveModifyRequest = null;
        oasis.names.tc.dss._1_0.core.schema.ResponseBaseType _archiveModify__return = port.archiveModify(_archiveModify_archiveModifyRequest);
        System.out.println("archiveModify.result=" + _archiveModify__return);


        }
        {
        System.out.println("Invoking archiveSubmit...");
        oasis.names.tc.dss._1_0.profiles.archive.ArchiveSubmitRequest _archiveSubmit_archiveSubmitRequest = null;
        oasis.names.tc.dss._1_0.profiles.archive.ArchiveSubmitResponse _archiveSubmit__return = port.archiveSubmit(_archiveSubmit_archiveSubmitRequest);
        System.out.println("archiveSubmit.result=" + _archiveSubmit__return);


        }
        {
        System.out.println("Invoking sign...");
        oasis.names.tc.dss._1_0.core.schema.SignRequest _sign_signRequest = null;
        oasis.names.tc.dss._1_0.core.schema.SignResponse _sign__return = port.sign(_sign_signRequest);
        System.out.println("sign.result=" + _sign__return);


        }
        {
        System.out.println("Invoking compoundAsync...");
        oasis.names.tc.dss._1_0.profiles.asynchronousprocessing._1.PendingRequest _compoundAsync_pendingRequest = null;
        oasis.names.tc.dss._1_0.profiles.compound.CompoundResponse _compoundAsync__return = port.compoundAsync(_compoundAsync_pendingRequest);
        System.out.println("compoundAsync.result=" + _compoundAsync__return);


        }
        {
        System.out.println("Invoking compound...");
        oasis.names.tc.dss._1_0.profiles.compound.CompoundRequest _compound_compoundRequest = null;
        oasis.names.tc.dss._1_0.profiles.compound.CompoundResponse _compound__return = port.compound(_compound_compoundRequest);
        System.out.println("compound.result=" + _compound__return);


        }
        {
        System.out.println("Invoking archiveVerify...");
        oasis.names.tc.dss._1_0.profiles.archive.ArchiveIdentifierRequest _archiveVerify_archiveVerifyRequest = null;
        oasis.names.tc.dss._1_0.core.schema.ResponseBaseType _archiveVerify__return = port.archiveVerify(_archiveVerify_archiveVerifyRequest);
        System.out.println("archiveVerify.result=" + _archiveVerify__return);


        }
        {
        System.out.println("Invoking archiveRetrieval...");
        oasis.names.tc.dss._1_0.profiles.archive.ArchiveIdentifierRequest _archiveRetrieval_archiveRetrievalRequest = null;
        oasis.names.tc.dss._1_0.profiles.archive.ArchiveRetrievalResponse _archiveRetrieval__return = port.archiveRetrieval(_archiveRetrieval_archiveRetrievalRequest);
        System.out.println("archiveRetrieval.result=" + _archiveRetrieval__return);


        }
        {
        System.out.println("Invoking verify...");
        oasis.names.tc.dss._1_0.core.schema.VerifyRequest _verify_verifyRequest = null;
        oasis.names.tc.dss._1_0.core.schema.VerifyResponse _verify__return = port.verify(_verify_verifyRequest);
        System.out.println("verify.result=" + _verify__return);


        }

        System.exit(0);
    }

}