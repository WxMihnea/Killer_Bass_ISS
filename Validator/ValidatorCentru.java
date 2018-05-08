package Validator;

import Domain.Centru;

public class ValidatorCentru implements Validator<Centru> {

    @Override
    public boolean validate(Centru entity) throws ValidatorException{
        String mesaj="";
        if (entity.getIDcentru()==null || entity.getIDcentru()<0)
            mesaj+="Id-ul centrului este invalid!\n";
        if (entity.getNume()==null  )
            mesaj+="Numele centrului este invalid!\n";
        if (mesaj!="")
            throw new ValidatorException(mesaj);
        return true;
    }

}
