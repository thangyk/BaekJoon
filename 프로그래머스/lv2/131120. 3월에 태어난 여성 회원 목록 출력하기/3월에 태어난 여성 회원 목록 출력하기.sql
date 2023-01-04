-- 코드를 입력하세요
SELECT member_id, member_name, gender, date_format(date_of_birth, '%Y-%m-%d')
    from member_profile
    where month(date_of_birth) = 03
        and tlno is not null
        and gender = 'W'
        order by member_id