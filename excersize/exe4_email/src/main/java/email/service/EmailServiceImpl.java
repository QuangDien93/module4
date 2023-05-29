package email.service;

import email.model.Email;
import email.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    EmailRepository emailRepository;
    @Override
    public Email showInfo() {
        return null;
    }

    @Override
    public boolean update(Email email) {
        return emailRepository.update(email);
    }

    @Override
    public Email getEmail() {
        return emailRepository.getEmail();
    }
}
