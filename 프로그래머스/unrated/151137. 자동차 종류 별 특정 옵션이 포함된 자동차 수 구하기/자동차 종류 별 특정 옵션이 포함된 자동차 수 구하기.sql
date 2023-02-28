select car_type, count(*) as cars
    from CAR_RENTAL_COMPANY_CAR
    where options regexp '가죽시트|통풍시트|열선시트'
    group by car_type
    order by car_type asc;