import React from 'react';

const TableReference = (props) => {
    const vec = props.vec;
    console.log(vec);
    return (
        <tr>
            <td><b> ID: {vec[0]}</b></td>
            <td>Reference: {vec[1]}</td>
        </tr>
    );
}

export default TableReference;