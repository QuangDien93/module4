package email.service;

import email.model.Email;

public interface EmailService {
    public Email showInfo();
    public boolean update(Email email);
    Email getEmail();
}
