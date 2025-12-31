namespace Demo_CustomAttributes
{
    [AttributeUsage(AttributeTargets.Class)]
    public class TableAttribute:Attribute
    {
        private string _TableName;

        public string TableName
        {
            get { return _TableName; }
            set { _TableName = value; }
        }

    }
    public class ColumnAttribute : Attribute
    {
        private string _ColumnName;

        public string ColumnName
        {
            get { return _ColumnName; }
            set { _ColumnName = value; }
        }

        private int _ColumnType;

        public int ColumnType
        {
            get { return _ColumnType; }
            set { _ColumnType = value; }
        }

    }
}
