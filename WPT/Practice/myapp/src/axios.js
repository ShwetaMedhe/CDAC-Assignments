import React,{useEffect,useState} from "react";
import axios from axios;

const GetData=()=>{
    const [data, setData]=useState([]);
    const [error, setError]=useState(null);

    useEffect(() => {
        axios
        .get()
        .then(response => setData(response.data));
        .catch(err => setError(err.message));

}[]);
 
if(error) return <div>Error:{error}</div>

return (
    <div>
        <h1>posts</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Title</th>
                    <th>Body</th>
                </tr>
            </thead>

            <tbody>
                {data.map((post)=>(
                    <td> <tr key={post.id}></tr>
                    <td>{post.id}</td>
                    <td>{post.title}</td>
                     <td>{post.Body}</td>

                    </td>
                   
                )
            )}
            </tbody>
        </table>
    </div>
)
  
}
