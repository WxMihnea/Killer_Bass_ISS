package Validator;

public interface Validator<E>{
    boolean validate(E entity) throws ValidatorException;
}
