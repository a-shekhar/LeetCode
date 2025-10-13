import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    df = students[students['student_id'] == 101]
    df = df[['name', 'age']]
    return df
    