select b.ingredient_type as INGREDIENT_TYPE, sum(a.total_order) as TOTAL_ORDER
    from first_half a join icecream_info b on a.flavor = b.flavor
    group by INGREDIENT_TYPE
    order by a.total_order asc;