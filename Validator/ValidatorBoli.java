package Validator;


import Domain.Boli;

public class ValidatorBoli implements Validator<Boli> {

        @Override
        public boolean validate(Boli entity) throws ValidatorException{
            String mesaj="";
            if (entity.getIDboala()==null || entity.getIDboala()<0)
                mesaj+="Id-ul bolii este invalid!\n";
            if (entity.getDenumire()==null  )
                mesaj+="Denumirea bolii este invalida!\n";
            if (entity.getDescriere()==null)
                mesaj+="Descrierea bolii este invalida!\n";
            if (mesaj!="")
                throw new ValidatorException(mesaj);
            return true;
        }

    }

