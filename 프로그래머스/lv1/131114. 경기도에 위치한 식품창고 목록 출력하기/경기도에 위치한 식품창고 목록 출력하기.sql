select WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, case
                                                    when FREEZER_YN is null then 'N'
                                                    else FREEZER_YN
                                                end
    from FOOD_WAREHOUSE
    where WAREHOUSE_NAME like '%경기%'
    order by WAREHOUSE_ID asc;