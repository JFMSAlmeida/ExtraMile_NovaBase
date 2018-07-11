import React, { Component } from 'react';


class Transaction extends Component {
    render(){
        const transactions = this.props.transactions;

        const transactionsArray = transactions.map(transaction => {
            return (
                <div>
                    Reference: {transaction.reference} &nbsp;
                    Type: {transaction.type} &nbsp;
                    Value: {transaction.value} &nbsp;
                    Time: {transaction.time}
                </div>

            );
        });

        return (
            <React.Fragment>
                {transactionsArray}
            </React.Fragment>
        )

    }
}

export default Transaction;