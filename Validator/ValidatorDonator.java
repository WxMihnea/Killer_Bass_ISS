package Validator;

import Domain.Donator;

public class ValidatorDonator implements Validator<Donator> {

    @Override
    public boolean validate(Donator entity) throws ValidatorException{
        String mesaj="";
        if (entity.getDonatorID()==null || entity.getDonatorID()<0)
            mesaj+="Id-ul donatorului este invalid!\n";
        if (entity.getPrenume()==null)
            mesaj+="Prenumele este invalid!\n";
        if (entity.getNume()==null)
            mesaj+="Numele este invalid!\n";
        if (entity.getNrTelefon()==null || !entity.getNrTelefon().matches("[0-9]{9,10}"))
            mesaj+="Numarul de telefon este invalid!\n";
        if (entity.getJudet()==null)
            mesaj+="Judetul este invalid!\n";
        if (entity.getOras()==null)
            mesaj+="Orasul este invalid!\n";
        if (entity.getStrada()==null)
            mesaj+="Strada este invalida!\n";
        if (entity.getApartament()==null || entity.getApartament()<0)
            mesaj+="Apartamentul este invalid!\n";
        if (entity.getCnp()==null || !entity.getCnp().matches("[0-9]{12,13}"))
            mesaj+="CNP-ul este invalid!\n";
        if (entity.getBloc()==null)
            mesaj+="Blocul este invalid!\n";
        if (entity.getScara()==null)
            mesaj+="Scara este invalida!\n";
        if (entity.getNumar()==null || entity.getNumar()<0)
            mesaj+="Numarul este invalid!\n";
        if (entity.getCodPostal()==null || !entity.getCodPostal().matches("[0-9]{5,6}"))
            mesaj+="Codul postal este invalid!\n";
        if (entity.getDataNasterii()==null || !entity.getDataNasterii().matches("[0-9]{1,2}+/[1-12]+/[0-9]{3,4}"))
            mesaj+="Data nasterii este invalida!\n";
        if (entity.getEmail()==null || !entity.getEmail().matches("[a-z0-9]+@[a-z]{2,8}.[a-z]{2,4}"))
            mesaj+="Email-ul este invalid!\n";



        if (mesaj!="")
            throw new ValidatorException(mesaj);
        return true;
    }

}