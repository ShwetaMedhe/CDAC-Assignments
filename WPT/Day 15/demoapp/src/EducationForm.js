import React, { useState } from 'react';

export default function EducationForm() {
  const [education, setEducation] = useState('');

  return (
    <div>
      <h2>User Details</h2>
      <label>
        Education Level:
        <select value={education} onChange={(e) => setEducation(e.target.value)}>
          <option value="">Select</option>
          <option value="Graduate">Graduate</option>
          <option value="PG">PG</option>
          <option value="UnderGrad">UnderGrad</option>
        </select>
      </label>

      {/* Graduate Component */}
      {education === 'Graduate' && (
        <div>
          <h3>Graduate Details</h3>
          <input placeholder="Degree" />
          <input placeholder="Year" />
          <input placeholder="Final Year Score" />
          <input placeholder="University" />
        </div>
      )}

      {/* PG Component */}
      {education === 'PG' && (
        <div>
          <h3>PG Details</h3>
          <input placeholder="Year" />
          <input placeholder="Thesis Subject" />
        </div>
      )}

      {/* UnderGrad Component */}
      {education === 'UnderGrad' && (
        <div>
          <h3>UnderGrad Details</h3>
          <input placeholder="SSC Score" />
          <input placeholder="HSC Score" />
        </div>
      )}
    </div>
  );
}
