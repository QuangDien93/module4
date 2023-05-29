package email.repository;

import email.model.Email;

public interface EmailRepository {
    public Email showInfo();
    Email getEmail();
    boolean update(Email email);
}
