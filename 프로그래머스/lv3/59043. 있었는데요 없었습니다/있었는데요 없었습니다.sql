select a.animal_id, a.name
    from animal_ins a join animal_outs b on a.animal_id = b.animal_id
    where a.datetime > b.datetime
    group by a.animal_id
    order by a.datetime;