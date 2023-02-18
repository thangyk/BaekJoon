select a.car_id
    from car_rental_company_rental_history as a join car_rental_company_car as b
                            on a.car_id = b.car_id
    where b.car_type = '세단'
            and date_format(start_date, '%m') = '10'
    group by car_id
    order by a.car_id desc