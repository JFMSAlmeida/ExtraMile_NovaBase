import React from 'react';

const TableReference = (props) => {
    return (
        <tr className="table_references_data">
            <td>{props.id}</td>
            <td>{props.reference}</td>
            <td>{props.price}€</td>
        </tr>
    );
}

export default TableReference;