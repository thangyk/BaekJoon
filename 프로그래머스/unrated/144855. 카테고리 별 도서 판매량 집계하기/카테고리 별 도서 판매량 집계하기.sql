select a.category, sum(b.sales) total_sales
    from book a join book_sales b on a.book_id = b.book_id
    where date_format(b.sales_date, '%Y-%m') = '2022-01' 
    # and (category, sum(sales)) in ('2022-01', 
    #                                                                      select a.category, sum(b.sales) 
    #                                                                         from book_sales 
    #                                                                         group by a.category)
    group by category
    order by a.category;