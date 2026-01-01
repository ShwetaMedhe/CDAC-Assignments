import React, { useState } from 'react';

function InputToList() {
  const [inputValue, setInputValue] = useState('');
  const [listItems, setListItems] = useState([]);

  const handleInputChange = (event) => {
    setInputValue(event.target.value);
  };

  const handleBlur = () => {
    if (inputValue.trim() !== '') {
      setListItems([...listItems, inputValue.trim()]);
      setInputValue('');
    }
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial, sans-serif' }}>
      <h2>Input Data to Ordered List</h2>

      <div style={{ marginBottom: '20px' }}>
        <input
          type="text"
          value={inputValue}
          onChange={handleInputChange}
          onBlur={handleBlur}
          placeholder="Type item and press Tab or click away..."
          style={{ 
            padding: '10px', 
            width: '300px', 
            borderRadius: '5px', 
            border: '1px solid #ccc' 
          }}
        />
      </div>

      <hr style={{ margin: '20px 0' }} />

      <h3>Submitted Data List</h3>
      {listItems.length === 0 ? (
        <p style={{ color: '#777' }}>No items submitted yet. (Use the input field above)</p>
      ) : (
        <ol style={{ 
          textAlign: 'left', 
          margin: '0 auto', 
          width: '300px', 
          listStyleType: 'decimal',
          paddingLeft: '20px'
        }}>
          {listItems.map((item, index) => (
            <li key={index} style={{ marginBottom: '5px' }}>
              {item}
            </li>
          ))}
        </ol>
      )}
    </div>
  );
}

export default InputToList;