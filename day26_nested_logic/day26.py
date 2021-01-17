#day26

ret_date = list(map(int, input().strip().split()))
due_date = list(map(int, input().strip().split()))


def computeFine(ret_date:list, due_date:list):
    ret_day, ret_month, ret_year = ret_date
    due_day, due_month, due_year = due_date

    if (ret_year < due_year):
        late = False
    else:
        if (ret_year > due_year):
            late = True
        elif (ret_month < due_month):
            late = False
        else:
            if (ret_month > due_month):
                late = True
            elif (ret_day <= due_day):
                late = False
            else:
                late = True

    if not late:
        fine = 0
    else:
        if due_month == ret_month and due_year == ret_year:
            fine = 15 * abs(due_day - ret_day)
        elif due_year == ret_year:
            fine = 500 * abs(due_month - ret_month)
        else:
            fine = 10000
    
    return fine


computeFine([9, 6, 2015], [6, 6, 2015])
computeFine([11, 20, 2015], [12, 31, 2014])
computeFine([9, 6, 2014], [11, 20, 2015])
computeFine([31, 12, 2009], [1, 1, 2010])