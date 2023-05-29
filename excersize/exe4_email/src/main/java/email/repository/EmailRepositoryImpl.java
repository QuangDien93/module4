package email.repository;

import email.model.Email;
import org.springframework.stereotype.Repository;

@Repository
public class EmailRepositoryImpl implements EmailRepository {
    public static String[] languages = {"English", "Vietnamese", "Japanese", "Chinese"};
    public static int[] pageSizes = {5, 10, 15, 25, 50, 100};

    public static Email email = new Email("English",25,true,"Many thanks");
    @Override
    public Email showInfo() {
        return null;
    }

    @Override
    public Email getEmail() {
        return email;
    }

    @Override
    public boolean update(Email emailUpdate) {
        email.setLanguage(emailUpdate.getLanguage());
        email.setPageSize(emailUpdate.getPageSize());
        email.setSpamsFilter(emailUpdate.isSpamsFilter());
        email.setSignature(emailUpdate.getSignature());
        return true;
    }
}
