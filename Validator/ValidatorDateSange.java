package Validator;

import Domain.DateSange;

public class ValidatorDateSange implements Validator<DateSange> {

    @Override
    public boolean validate(DateSange entity) throws ValidatorException{
        String mesaj="";
        if (entity.getIDsange()==null || entity.getIDsange()<0)
            mesaj+="Id-ul sangelui este invalid!\n";
        if (entity.getGrupaSanguina()==null  )
            mesaj+="Grupa sanguina este invalida!\n";
        if (entity.getSanatos()==null || (entity.getSanatos()!="DA" && entity.getSanatos()!="NU"))
            mesaj+="Date invalide!\n";
        if (entity.getRH()==null || (entity.getRH()!="POZITIV" && entity.getSanatos()!="NEGATIV"))
            mesaj+="RH invalid!\n";
        if (entity.getTrombocite()==null)
            mesaj+="Date trombocite invalide!\n";
        if (entity.getLeucocite()==null)
            mesaj+="Date leucocite invalide!\n";
        if (entity.getHematii()==null)
            mesaj+="Date hematii invalide!\n";


        if (mesaj!="")
            throw new ValidatorException(mesaj);
        return true;
    }

}
