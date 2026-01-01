import React, { useState } from 'react';

export default function TextFormatter() {
  const [text, setText] = useState('');
  const [format, setFormat] = useState('');

  const formatText = () => {
    if (format === 'uppercase') {
      return text.toUpperCase();
    } else if (format === 'lowercase') {
      return text.toLowerCase();
    } else if (format === 'titlecase') {
      return text
        .toLowerCase()
        .split(' ')
        .map(word => word.charAt(0).toUpperCase() + word.slice(1))
        .join(' ');
    } else {
      return '';
    }
  };

  return (
    <div>
      <h3>Text Formatter</h3>
      <input
        type="text"
        value={text}
        onChange={(e) => setText(e.target.value)}
        placeholder="Enter text"
      />
      <br />
      <label>
        <input
          type="radio"
          value="uppercase"
          checked={format === 'uppercase'}
          onChange={(e) => setFormat(e.target.value)}
        />
        Uppercase
      </label>
      <label>
        <input
          type="radio"
          value="lowercase"
          checked={format === 'lowercase'}
          onChange={(e) => setFormat(e.target.value)}
        />
        Lowercase
      </label>
      <label>
        <input
          type="radio"
          value="titlecase"
          checked={format === 'titlecase'}
          onChange={(e) => setFormat(e.target.value)}
        />
        Title Case
      </label>
      <p>Formatted Text: {formatText()}</p>
    </div>
  );
}
