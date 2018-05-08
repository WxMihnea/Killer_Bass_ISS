package Validator;


import Domain.PersonalCE;

public class ValidatorPersonalCE implements Validator<PersonalCE> {

    @Override
    public boolean validate(PersonalCE entity) throws ValidatorException{
        String mesaj="";
        if (entity.getIDpersonal()==null || entity.getIDpersonal()<0)
            mesaj+="Id-ul personaluluiCE este invalid!\n";
        if (entity.getFunctie()==null  )
            mesaj+="Functia este invalida!\n";
        if (entity.getPrenume()==null)
            mesaj+="Prenumele este invalid!\n";
        if (entity.getNume()==null)
            mesaj+="Numele este invalid!\n";
        if (entity.getNrTelefon()==null || !entity.getNrTelefon().matches("[0-9]{9,10}"))
            mesaj+="Numarul de telefon este invalid!\n";



        if (mesaj!="")
            throw new ValidatorException(mesaj);
        return true;
    }

}