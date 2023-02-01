select a.flavor
    from first_half as a
    join icecream_info as b on a.flavor = b.flavor
    where a.total_order > 3000 and b.INGREDIENT_TYPE = 'fruit_based'
    order by total_order desc;