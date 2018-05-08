package Validator;

import Domain.Client;


public class ValidatorClient implements Validator<Client> {

        @Override
        public boolean validate(Client entity) throws ValidatorException{
            String mesaj="";
            if (entity.getIDclinica()==null || entity.getIDclinica()<0)
                mesaj+="Id-ul clinicii este invalid!\n";
            if (entity.getContact()==null  )
                mesaj+="Contact invalid!\n";
            if (entity.getAdresa()==null)
                mesaj+="Adresa clinicii este invalida!\n";
            if (mesaj!="")
                throw new ValidatorException(mesaj);
            return true;
        }

    }
