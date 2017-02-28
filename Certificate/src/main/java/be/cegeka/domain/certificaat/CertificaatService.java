package be.cegeka.domain.certificaat;

import be.cegeka.domain.order.Order;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class CertificaatService {
    @Inject
    CertificaatRepository certificaatRepository;

    public void addCertificate(Certificaat certificaat) {
        certificaatRepository.addCertificate(certificaat);
    }

    public List<Certificaat> getCertificates() {
        return certificaatRepository.getCertificats();
    }

}
