select ANIMAL_ID, NAME, SEX_UPON_INTAKE
    from animal_ins
    where name in ('lucy', 'ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
    order by animal_id;