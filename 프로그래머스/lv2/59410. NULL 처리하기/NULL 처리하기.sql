select ANIMAL_TYPE, 
    case
        when name is null then 'No name'
        else name
    end
    as NAME, SEX_UPON_INTAKE
    from ANIMAL_INS
    